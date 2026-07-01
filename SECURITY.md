# Security Policy

## Supported Versions

| Version | Status |
|---------|--------|
| 1.x     | ✅ Supported |

## Reporting a Vulnerability

If you discover a security vulnerability, please email Andresqr19 instead of using the issue tracker.

## Security Best Practices

1. **Dependency Management**
   - Run `mvn dependency:check` regularly
   - Use OWASP Dependency Check plugin
   - Keep Spring Boot updated (currently using LTS 2.7.x)

2. **Code Quality**
   - Java 11+ required
   - Environment variables for sensitive data
   - Never commit application-prod.properties with credentials

3. **Build & Deploy**
   - Always use `mvn clean verify` before deployment
   - Run security checks: `mvn org.owasp:dependency-check-maven:check`

## Java & Spring Boot Versions

- Java: 11 (LTS)
- Spring Boot: 2.7.x (LTS)
- Maven: 3.6.3+
