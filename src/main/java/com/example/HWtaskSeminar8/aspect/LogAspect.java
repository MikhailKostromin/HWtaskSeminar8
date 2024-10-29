package com.example.HWtaskSeminar8.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Класс определяющий аспект поведения приложения.
 */
@Aspect
@Component
public class LogAspect {
    /**
     * Логирование методов приложения.
     *
     * @param joinPoint метод для обработки.
     * @return результат работы обрабатываемого метода.
     * @throws Throwable исключения при обработке метода.
     */

    @Around("@annotation(com.example.HWtaskSeminar8.aspect.TrackUserAction)")
    public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Пользователь вызвал метод " +
                           joinPoint.getSignature().getName() + ".");
        Object proceed = joinPoint.proceed();
        System.out.println("Метод завершил работу.");
        return proceed;
    }
}
