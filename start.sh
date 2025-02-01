SET USER=user
SET WD_PORT=4444

SET SSS=selenium-server-standalone-2.48.2.jar
SET CHROME_DRIVER_FILE_NAME=chromedriver.exe


SET IP=http://192.168.1.01
SET PORT=5555
SET THIS_FOLDER_PATH=C:\Users\%USER%\Desktop\selenium


cd %THIS_FOLDER_PATH%/src
start cmd /k "hub.bat"
call "node.bat"