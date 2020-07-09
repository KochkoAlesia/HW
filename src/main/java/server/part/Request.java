package server.part;

import java.io.Serializable;

public class Request implements Serializable {

  private TypeOfSupportedQueries type;
  private Serializable payload;

  public Request(TypeOfSupportedQueries type, Serializable payload) {
    this.type = type;
    this.payload = payload;
  }

  public Request(TypeOfSupportedQueries type) {
    this.type = type;
  }

  public TypeOfSupportedQueries getType() {
    return type;
  }

  public Serializable getPayload() {
    return payload;
  }

  @Override
  public String toString() {
    return "Request{" +
        "type=" + type +
        ", payload=" + payload +
        '}';
  }
}
