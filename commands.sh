docker build -t coding-gym .
docker run -d --name coding-gym-db -p 5432:5432 coding-gym