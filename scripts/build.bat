set JAVA_HOME=%cd%\scripts\bin\jdk
cd %JAVA_HOME%
for /r %%x in (*.pack) do .\bin\unpack200 -r "%%x" "%%~dx%%~px%%~nx.jar"
cd ../../../
SETLOCAL EnableDelayedExpansion
for /F "tokens=1,2 delims=#" %%a in ('"prompt #$H#$E# & echo on & for %%b in (1) do     rem"') do (
  set "DEL=%%a"
)
rem Prepare a file "X" with only one dot
<nul > X set /p ".=."

CALL :color 03 "Building SpotifyXP"
echo.
echo Please wait...

IF EXIST "%cd%/target/" CALL "%cd%\scripts\utils\clean.bat"
IF EXIST "%cd%/build/" CALL "%cd%\scripts\utils\clean.bat"

REM CALL mvn clean package
IF "%2" == "--debug" CALL "%cd%\scripts\bin\maven\bin\mvn.cmd" clean package
IF NOT "%2" == "--debug" CALL "%cd%\scripts\bin\maven\bin\mvn.cmd" -q clean package

MKDIR build

IF EXIST "%cd%\target\SpotifyXP.jar" copy /y "%cd%\target\SpotifyXP.jar" "%cd%\build\SpotifyXP.jar" > nul

IF NOT EXIST "%cd%\build\SpotifyXP.jar" "%cd%\scripts\utils\failed.bat"

"%cd%\scripts\utils\success.bat"

:color
set "param=^%~2" !
set "param=!param:"=\"!"
findstr /p /A:%1 "." "!param!\..\X" nul
<nul set /p ".=%DEL%%DEL%%DEL%%DEL%%DEL%%DEL%%DEL%"
exit /b



