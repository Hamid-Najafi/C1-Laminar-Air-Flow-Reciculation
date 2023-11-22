//-------------------------------------
//Script Created: Mar 15, 2023
//
// Description:
// 
//-------------------------------------
int MarginLow = 50;
int MarginHigh = 200;
int StepLow = 150;
int StepHigh = 500;
int MaxSetpoint = 16384;
int MinSetpoint = 0;
int MaxRPM = 1430;
int MaxAIN1 = 10000; // 10000 is max AIN1 (10vDC)
float LStoCFMfatcor = 2.1188799728;
// Modbus Speed Setpoit is a number between 0 and 16384 whitch set frequency of Inverter beetwen 0 and FREQ REF (HSW)
//-------------------------------------
// Firstly Calculate CFM based on DPT Mode
double AQ_LSV;
double AQ_CFM;
// double CFM.getIntValue();
if (DPTFlowUsed.getIntValue() == 1)
{
    // DPT-Flow Used
    // int a = SINAMICS_V20_VAR.ANALOG_IN_1.getIntValue();
    int a = SINAMICS_V20_VAR.ANALOG_IN_1.getIntValue() * VOutMax.getIntValue() / MaxAIN1;
    CFM.write(a);  // (0-10v ~ 0-10000 cfm)
}
else if (DPTFlowUsed.getIntValue() == 0)
{
    // DPT-R8 Used
    // int DPSPreasureV = SINAMICS_V20_VAR.ANALOG_IN_1.getIntValue() / 10;  // (0-10v ~ 0-1000 Pa ~ 0-2972 l/s ~ 0-6272cfm with kvalue = 94)
    int DPSPreasureV = SINAMICS_V20_VAR.ANALOG_IN_1.getIntValue() * POutMax.getIntValue() / MaxAIN1;
    deltaP.write(DPSPreasureV);
    AQ_LSV = kvalue.getIntValue() * Math.sqrt((double)DPSPreasureV); // in l/s
    AQ_CFM = AQ_LSV * LStoCFMfatcor; // in cfm
    CFM.write(AQ_CFM);
}
//-------------------------------------
if (SINAMICS_V20_VAR.STOP_RUN.getIntValue() == 0)
{
    SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(0);
}
else if (SINAMICS_V20_VAR.STOP_RUN.getIntValue() == 1)
{
    if (WorkingModeAuto.getIntValue() == 0)
    {
        int y = ManualModeSpeedSetpoint.getIntValue() * MaxSetpoint / MaxRPM;
        // if(x > MaxSetpoint) x = MaxSetpoint;
        // if(x < MinSetpoint) x = MinSetpoint;
        SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(y);
    }
    else if (WorkingModeAuto.getIntValue() == 1)
    {
        if (CFM.getIntValue() < (RefCFM.getIntValue() - MarginLow))
        {
            if (CFM.getIntValue() > (RefCFM.getIntValue() - MarginHigh))
            {
                int x = SINAMICS_V20_VAR.HSW_SpeedSetpoint.getIntValue();
                x += StepLow;
                if (x > MaxSetpoint) x = MaxSetpoint;
                SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(x);
            }
            else
            {
                int x = SINAMICS_V20_VAR.HSW_SpeedSetpoint.getIntValue();
                x += StepHigh;
                if (x > MaxSetpoint) x = MaxSetpoint;
                SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(x);
            }
        }
        if (CFM.getIntValue() > (RefCFM.getIntValue() + MarginLow))
        {
            if (CFM.getIntValue() < (RefCFM.getIntValue() + MarginHigh))
            {
                int x = SINAMICS_V20_VAR.HSW_SpeedSetpoint.getIntValue();
                x -= StepLow;
                if (x < MinSetpoint) x = MinSetpoint;
                SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(x);
            }
            else
            {
                int x = SINAMICS_V20_VAR.HSW_SpeedSetpoint.getIntValue();
                x -= StepHigh;
                if (x < MinSetpoint) x = MinSetpoint;
                SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(x);
            }
        }
    }
}