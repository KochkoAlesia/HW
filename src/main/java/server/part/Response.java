package server.part;

import java.io.Serializable;

public class Response {

  private Serializable payload;

  public Response(Serializable payload) {
    this.payload = payload;
  }

  public Response() {
  }

  public Serializable getPayload() {
    return payload;
  }
}
