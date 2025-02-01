#!/bin/bash
title node
TIMEOUT /T 5
java -Dwebdriver.chrome.driver=%THIS_FOLDER_PATH%/src/%CHROME_DRIVER_FILE_NAME% -jar %SSS% -role webdriver -hub %IP%:%WD_PORT%/grid/register -port %PORT%