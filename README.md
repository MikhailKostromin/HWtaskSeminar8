Базовое задание:
Домашнее задание выполнить для одного из пройденных семинаров в проекте с Базой Данных.
Вам необходимо разработать механизм регистрации действий пользователя в вашем Spring Boot приложении. Используйте Spring AOP
для создания журнала действий, в котором будет сохраняться информация о том, какие методы сервиса вызывались, кем и с какими параметрами.
Создайте аннотацию @TrackUserAction.
Реализуйте aspect, который будет регистрировать действия пользователя, когда вызывается метод, отмеченный этой аннотацией.
Примените аннотацию @TrackUserAction к нескольким методам в слое сервиса.
Результаты регистрации в консоль

ФОТО ПРОЕКТА
<img width="1280" alt="Снимок экрана 2024-02-14 в 23 16 24" src="https://github.com/MikhailKostromin/HWtaskSeminar8/assets/110930748/56501675-98a6-4c60-9208-28719756e12f">


<img width="1280" alt="Снимок экрана 2024-02-14 в 23 19 09" src="https://github.com/MikhailKostromin/HWtaskSeminar8/assets/110930748/94039012-028c-4bd0-bb38-bd014c138086">

Задание: По примерам показанным на семинаре 11:
1) Подключить к своему проекту зависимости actuator, registry-prometheus и micrometer.
2) Установить и подключить к проекту prometheus
3) Установить и подключить Grafana. В Grafana добавить пару точеу контроля( Например: процессоное время приложения и количество запросов)
Формат сдачи: проект с добавленными зависимостями, файл настройки prometheus и скриншот Grafana с добавленными контрольными точками.
<img width="1280" alt="Снимок экрана 2024-02-25 в 23 37 55" src="https://github.com/MikhailKostromin/HWtaskSeminar8/assets/110930748/c7ede664-cbf8-4b59-9e81-1013121bee59">

<img width="1280" alt="Снимок экрана 2024-02-25 в 23 40 43" src="https://github.com/MikhailKostromin/HWtaskSeminar8/assets/110930748/585849c5-e8a0-4d36-9230-949ff379a2bf">

<img width="1280" alt="Снимок экрана 2024-02-25 в 23 58 10" src="https://github.com/MikhailKostromin/HWtaskSeminar8/assets/110930748/47cc9997-6f8f-483b-8c51-187685542ebe">

<img width="1280" alt="Снимок экрана 2024-02-26 в 00 06 50" src="https://github.com/MikhailKostromin/HWtaskSeminar8/assets/110930748/3104ca69-a97d-450d-846e-917b62ca8fda">

Настройки  prometheus.yml

<img width="1280" alt="Снимок экрана 2024-02-26 в 20 03 20" src="https://github.com/MikhailKostromin/HWtaskSeminar8/assets/110930748/f2776d4d-5c14-4d68-bad4-58c4d62981fb">



