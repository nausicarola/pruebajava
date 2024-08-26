# pruebajava
Configuración
Clona el repositorio desde GitHub:
bash
git clone https://github.com/nausicarola/pruebajava.git

Navega al directorio del proyecto:
bash
cd tu-repositorio

Compila y empaqueta la aplicación:
Con Maven
bash
mvn clean package

Con Gradle
bash
./gradlew clean build

Inicia la aplicación:
bash
java -jar target/demo-0.0.1-SNAPSHOT.jar

o
bash
java -jar build/libs/demo-0.0.1-SNAPSHOT.jar

La aplicación se ejecutará en http://localhost:8080.
Probar la API
Envía una solicitud POST a http://localhost:8080/api/users con el siguiente JSON en el cuerpo:
json
{
  "name": "Juan Rodriguez",
  "email": "juan@rodriguez.org",
  "password": "hunter2",
  "phones": [
    {
      "number": "1234567",
      "citycode": "1",
      "countrycode": "57"
    }
  ]
}

Si el usuario se crea correctamente, recibirás una respuesta con código de estado HTTP 201 (Created) y el usuario creado con los siguientes campos:
json
{
  "id": "uuid-generado",
  "name": "Juan Rodriguez",
  "email": "juan@rodriguez.org",
  "created": 1624476000000,
  "modified": 1624476000000,
  "last_login": 1624476000000,
  "token": "uuid-token",
  "isactive": true
}

Si el correo electrónico ya está registrado, recibirás un error con código de estado HTTP 409 (Conflict) y el siguiente mensaje:
json
{
  "mensaje": "El correo ya registrado"
}

Si el formato del correo electrónico o la contraseña no es válido, recibirás un error con código de estado HTTP 400 (Bad Request) y un mensaje de error en formato JSON.
Configuración de la Base de Datos
La aplicación utiliza H2 como base de datos en memoria. Puedes acceder a la consola web de H2 en http://localhost:8080/h2-console y usar las siguientes credenciales:
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: (vacío)
