#### Initialize Git Repo
```
git init
```
#### Clone Repo from github
```
git clone https://github.com/username/repo-name.git
```
#### Add files to git for commit
``` 
git add .
```
#### Check Git Status
``` 
git status
```
#### Check Git Log
``` 
git log
```
#### Commit
```
git commit -m "write your message for this commit"
```
#### Pull from remote repo
```
git pull origin <branch-name>
```
#### Push to remote repo
```
git push origin <branch-name>
```
#### Create Branch
```
git branch your-branch-name
```
#### Checkout Branch
```
git checkout branch-name
```
#### Delete Local Branch
```
git branch -d branch-name
```
#### Add local git repo to remote repo
```
git remote add origin https://github.com/user/repo.git
```

#### Verify new remote
```
git remote -v
```
#### Reset Remote
```
git remote set-url origin git://new.url.here
```
#### Remove Remote
```
git remote remove origin 
or
git remote rm origin
```

#### Show Local Config
```
git config --local --list
```

#### Show Global Config
```
git config --global --list
```

#### Set Local Username
``` 
git config --local user.name "username"
```

#### Set Global Username
``` 
git config --global user.name "username"
```
#### Set Local Email
``` 
git config --local user.email "email@address"
```

#### Set Global Email
``` 
git config --global user.email "email@address"
```
#### Configure SSH
``` 
git config --local core.sshCommand "ssh -i ~/.ssh/ssh_private_key -F /dev/null"
```