https://microshed.org/microshed-testing/features/01_SupportedRuntimes.html   


sudo docker build -f src/main/docker/Dockerfile .

Caused by: com.github.dockerjava.api.exception.InternalServerErrorException: {"message":"OCI runtime create failed: container_linux.go:346: starting container process caused \"process_linux.go:297: applying cgroup configuration for process caused \\\"open /sys/fs/cgroup/docker/cpuset.cpus.effective: no such file or directory\\\"\": unknown"}
sudo dnf install grubby
sudo grubby --update-kernel=ALL --args="systemd.unified_cgroup_hierarchy=0"

sudo groupadd docker
sudo usermod -aG docker $USER

sudo systemctl start docker

org.testcontainers.containers.ContainerLaunchException: Could not create/start container