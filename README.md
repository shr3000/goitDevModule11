# goitDevModule11
Завдання №1 - додай сутність Ticket
Додай нову сутність - Ticket. Напиши maping для Hibernate для роботи з цією сутністю.

Зверни увагу, що в цій сутності є мапінги one-to-many. Наприклад, у одного клієнта може 
бути багато квитків. Відповідно, в сутності Ticket має бути не ідентифікатор клієнта, а 
саме поле типу Client з коректно прописаним мапінгом. Це ж стосується початкової та 
кінцевої планет.

Завдання №2 - додай CRUD сервіс для роботи з квитками
Напиши CRUD сервіс для роботи з квитками.

Перевір, що твій код коректно працює. Зокрема, перевір наступні ситуації:

не можна зберегти квиток для неіснуючого або null клієнта
не можна зберегти квиток для неіснуючої або null планети
Завдання №3 - залий код на Github
Залий код на Github репозиторій. Переконайсь, що файл .gitignore налаштований коректно, 
і в репозиторій потрапили лише потрібні файли.

Результат ДЗ - посилання на репозиторій.