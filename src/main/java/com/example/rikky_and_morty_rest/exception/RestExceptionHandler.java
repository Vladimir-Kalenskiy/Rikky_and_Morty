package com.example.rikky_and_morty_rest.exception;

/**
 * Глобальный обработчик исключений для REST контроллеров.
 */

//@ControllerAdvice
//public class RestExceptionHandler {
//        /**
//         * Обрабатывает исключение CharacterNotFoundException.
//         * @param e Исключение CharacterNotFoundException
//         * @return Ответ с ошибкой 404 и сообщением "Character not found"
//         */
//    @ExceptionHandler(CharacterNotFoundException.class)
//    ResponseEntity<String> handleCharacterNotFoundException(CharacterNotFoundException e) {
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); //"Character not found"
//    }
//}

/**
 * Когда я пробовала создать отдельный обработчки для RESTful - при неверном id получаю статус 200
 * и в теле html код страницы characterNotFound.html. Поэтому пока оставила один обработчик для
 * CharacterController.java, а обработку исключения для RESTful добавила непосредственно в метод.
 * Почитаю еще, как это можно сделать одновременно и корректно.
 */