package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new eu.siacs.conversations.DataBinderMapperImpl());
  }
}
