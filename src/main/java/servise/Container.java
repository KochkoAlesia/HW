package servise;

import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;

public interface Container<T> {

  void add(T element);

  void put(int index, T element);

  void delete(int index);

//  void sort(Comparator <T> c) throws IOException;
void sort() throws IOException;
  int size();

  Collection<T> getAll();
}
