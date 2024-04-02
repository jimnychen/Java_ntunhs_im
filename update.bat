set /p commitmessage=input commit message :
git add .
git commit -m  %commitmessage%
git push origin main
