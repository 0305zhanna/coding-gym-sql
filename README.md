# coding-gym-sql
This repository is a set of files for a coding gym lesson. It includes Docker file for test database installation and initialization and ex.sql - file with exercises.
</br>
To run docker container you need to type following commands in project root directory console:
```
docker build -t coding-gym .
docker run -d --name coding-gym-db -p 5432:5432 coding-gym
```
