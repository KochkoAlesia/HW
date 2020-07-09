package servise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class LocalContainer<T> implements Container <T> {

  private List <T>  collection = new ArrayList<>();

  @Override
  public void add(T element) {
       collection.add(element);
  }

  @Override
  public void put (int index, T element) {
    collection.set(index, element);
  }

  @Override
  public void delete (int index) {
  collection.remove(index);
  }

  @Override
  public void sort() {
   collection.sort((Comparator<? super T>) collection);
  }

  @Override
  public int size () {
    return collection.size();
  }

  @Override
  public Collection getAll() {
    return collection;
  }
}






