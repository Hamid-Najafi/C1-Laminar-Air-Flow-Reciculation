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
if(SINAMICS_V20_VAR.STOP_RUN.getIntValue() == 0)
{
    SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(0);
}
else if (SINAMICS_V20_VAR.STOP_RUN.getIntValue() == 1){
if (WorkingModeAuto.getIntValue() == 0)
{
    int y = ManualModeSpeedSetpoint.getIntValue() * MaxSetpoint / 1430;
    // if(x > MaxSetpoint) x = MaxSetpoint;
    // if(x < MinSetpoint) x = MinSetpoint;
    SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(y);
}
else if (WorkingModeAuto.getIntValue() == 1)
{
if(SINAMICS_V20_VAR.ANALOG_IN_1.getIntValue()<(RefCFM.getIntValue() - MarginLow))
{
    if(SINAMICS_V20_VAR.ANALOG_IN_1.getIntValue() > (RefCFM.getIntValue() - MarginHigh))
    {
    int x = SINAMICS_V20_VAR.HSW_SpeedSetpoint.getIntValue();
    x += StepLow;
    if(x > MaxSetpoint) x = MaxSetpoint;
    SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(x);
    }
    else
    {
    int x = SINAMICS_V20_VAR.HSW_SpeedSetpoint.getIntValue();
    x += StepHigh;
    if(x > MaxSetpoint) x = MaxSetpoint;
    SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(x);
    }
}
if (SINAMICS_V20_VAR.ANALOG_IN_1.getIntValue() > (RefCFM.getIntValue() + MarginLow))
{
    if(SINAMICS_V20_VAR.ANALOG_IN_1.getIntValue() < (RefCFM.getIntValue() + MarginHigh))
    {
    int x = SINAMICS_V20_VAR.HSW_SpeedSetpoint.getIntValue();
    x -= StepLow;
    if(x < MinSetpoint) x = MinSetpoint;
    SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(x);
    }
    else
    {
    int x = SINAMICS_V20_VAR.HSW_SpeedSetpoint.getIntValue();
    x -= StepHigh;
    if(x < MinSetpoint) x = MinSetpoint;
    SINAMICS_V20_VAR.HSW_SpeedSetpoint.write(x);
    }
}
}
}