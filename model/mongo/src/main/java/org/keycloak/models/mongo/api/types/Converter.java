package org.keycloak.models.mongo.api.types;

/**
 * SPI object to convert object from application type to database type and vice versa. Shouldn't be directly used by application.
 * Various converters should be registered in TypeConverter, which is main entry point to be used by application
 *
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
public interface Converter<T, S> {

    /**
     * Convert object from one type to expected type
     *
     * @param converterContext Encapsulates reference to converted object and other things, which might be helpful in conversion
     * @return converted object
     */
    S convertObject(ConverterContext<T> converterContext);

    Class<? extends T> getConverterObjectType();

    Class<S> getExpectedReturnType();
}
