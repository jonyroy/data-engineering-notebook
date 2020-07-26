

resource "google_compute_instance" "hello_world_instance" {
  name = "hello-world-instance"
  machine_type = "f1-micro"
  zone = "us-central1-a"

  tags = ["hello-world"]
  boot_disk {
    initialize_params {
      image = "centos-8-v20200714"
    }
  }
  network_interface {
    network = "default"
    access_config {

    }
  }
}