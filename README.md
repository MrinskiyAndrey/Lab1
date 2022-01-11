# Технология разработки программного обеспечения
#### Лабораторная работа № 1: создание микросервиса на Spring Boot с базой данных
#### Мринский Андрей Николаевич, группа МБД2131
#### Целью лабораторной работы является знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов).
#
#
# **Инструкция по сборке проекта:**
###
#### 1.Запустить в докере базу данных на порту 5432 (логин postgres пароль root)
#### 2. Подгрузить в базу данных структуру и данные (schema.sql и data.sql)
#### 3. Запустить приложение через IntelejiIDEA, либо собрать докер образ и запустить его на порту 8080 (см. ниже)
#
# **Ответы на дополнительные вопросы:**
###
### ***склонировать репозиторий***
#### - git clone [url]
###
### ***команда для сборки приложения в Maven из командной строки:***
#### - из директории где находится pom.xml набрать  "mvn package" (без ковычек)
###
### ***команда для сборки docker-образа из командной строки:***
#### - docker build . -t myapi:latest
###
### ***команда для запуска docker-контейнера из docker-образа с указанием маппинга портов:***
#### - docker run -p 8080:8080 myapi:latest
###
### ***4 curl (или больше) для обращения к ендпоинтам приложения:***
#### - http://localhost:8080/api/v1/product/1
#### - http://localhost:8080/api/v1/product/2
#### - http://localhost:8080/api/v1/product/3
#### - http://localhost:8080/api/v1/product/4
###
### ***curl для обращения к ендпоинту, возвращающему hostname:***
#### - http://localhost:8080/api/v1/status


#
# Лабораторная работа №3: CI/CD и деплой приложения в Heroku

## Целью лабораторной работы является знакомство с CI/CD и его реализацией на примере Travis CI и Heroku.


### Travis CI badge

[![Build Status](https://app.travis-ci.com/MrinskiyAndrey/Sportfood.svg?branch=main)](https://app.travis-ci.com/MrinskiyAndrey/Sportfood)

#
#### Приложение так и не смог задиплоить в хироку, ниже лог ошибок (из IDE компилиться и работает исправно)

![Снимок экрана от 2022-01-10 19-25-43](https://user-images.githubusercontent.com/97047164/148801348-c5ee38df-8f00-449b-b49b-814a420758b8.png)

