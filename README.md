# ToDoManager - DevOps CI/CD Project

## Tech Stack
- Java + Maven
- JUnit for Testing
- GitHub Actions for CI/CD
- Puppet for provisioning
- Grafana + Graphite (Simulated)

## CI/CD Pipeline
- On push → GitHub Action triggers
- Runs: `mvn clean package`, `mvn test`

## Infrastructure
- Puppet script installs Java

## Monitoring
- Metrics simulated in `grafana/dashboard.json`

## How to run
- Clone the repository
- Run `mvn clean package` to build the app
- Run `mvn test` to run the unit tests

## License
This project is licensed under the MIT License.
