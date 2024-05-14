package copyProperties;

import ma.glasnost.orika.*;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.metadata.ClassMap;
import ma.glasnost.orika.metadata.ClassMapBuilder;
import ma.glasnost.orika.metadata.MapperKey;
import ma.glasnost.orika.metadata.Type;
import ma.glasnost.orika.unenhance.UnenhanceStrategy;

import java.util.Collections;
import java.util.Set;

public class CustomFactory implements MapperFactory {
    @Override
    public <A, B> Mapper<A, B> lookupMapper(MapperKey mapperKey) {
        return null;
    }

    @Override
    public <A, B> Mapper<A, B> lookupMapper(MapperKey mapperKey, MappingContext mappingContext) {
        return null;
    }

    @Override
    public boolean existsRegisteredMapper(Type<?> type, Type<?> type1, boolean b) {
        return false;
    }

    @Override
    public <A, B> void registerMapper(Mapper<A, B> mapper) {

    }

    @Override
    public <A, B> void registerClassMap(ClassMap<A, B> classMap) {

    }

    @Override
    public <A, B> void registerClassMap(ClassMapBuilder<A, B> classMapBuilder) {

    }

    @Override
    public <T> void registerObjectFactory(ObjectFactory<T> objectFactory, Class<T> aClass) {

    }

    @Override
    public <T> void registerObjectFactory(ObjectFactory<T> objectFactory, Type<T> type) {

    }

    @Override
    public <T, S> void registerObjectFactory(ObjectFactory<T> objectFactory, Type<T> type, Type<S> type1) {

    }

    @Override
    public <T> ObjectFactory<T> lookupObjectFactory(Type<T> type) {
        return null;
    }

    @Override
    public <T, S> ObjectFactory<T> lookupObjectFactory(Type<T> type, Type<S> type1) {
        return null;
    }

    @Override
    public <T, S> ObjectFactory<T> lookupObjectFactory(Type<T> type, Type<S> type1, MappingContext mappingContext) {
        return null;
    }

    @Override
    public <S, D> Type<? extends D> lookupConcreteDestinationType(Type<S> type, Type<D> type1, MappingContext mappingContext) {
        return null;
    }

    @Override
    public void registerMappingHint(MappingHint... mappingHints) {

    }

    @Override
    public void registerDefaultFieldMapper(DefaultFieldMapper... defaultFieldMappers) {

    }

    @Override
    public void registerConcreteType(Type<?> type, Type<?> type1) {

    }

    @Override
    public void registerConcreteType(Class<?> aClass, Class<?> aClass1) {

    }

    @Override
    public Set<ClassMap<Object, Object>> lookupUsedClassMap(MapperKey mapperKey) {
        return Collections.emptySet();
    }

    @Override
    public <A, B> ClassMap<A, B> getClassMap(MapperKey mapperKey) {
        return null;
    }

    @Override
    public Set<Type<? extends Object>> lookupMappedClasses(Type<?> type) {
        return Collections.emptySet();
    }

    @Override
    public MapperFacade getMapperFacade() {
        return null;
    }

    @Override
    public <A, B> BoundMapperFacade<A, B> getMapperFacade(Type<A> type, Type<B> type1) {
        return null;
    }

    @Override
    public <A, B> BoundMapperFacade<A, B> getMapperFacade(Class<A> aClass, Class<B> aClass1) {
        return null;
    }

    @Override
    public <A, B> BoundMapperFacade<A, B> getMapperFacade(Type<A> type, Type<B> type1, boolean b) {
        return null;
    }

    @Override
    public <A, B> BoundMapperFacade<A, B> getMapperFacade(Class<A> aClass, Class<B> aClass1, boolean b) {
        return null;
    }

    @Override
    public ConverterFactory getConverterFactory() {
        return null;
    }

    @Override
    public void build() {

    }

    @Override
    public <A, B> ClassMapBuilder<A, B> classMap(Type<A> type, Type<B> type1) {
        return null;
    }

    @Override
    public <A, B> ClassMapBuilder<A, B> classMap(Class<A> aClass, Type<B> type) {
        return null;
    }

    @Override
    public <A, B> ClassMapBuilder<A, B> classMap(Type<A> type, Class<B> aClass) {
        return null;
    }

    @Override
    public <A, B> ClassMapBuilder<A, B> classMap(Class<A> aClass, Class<B> aClass1) {
        return null;
    }

    @Override
    public UnenhanceStrategy getUserUnenhanceStrategy() {
        return null;
    }

    @Override
    public void registerFilter(Filter<?, ?> filter) {

    }
}
