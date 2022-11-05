def buildJar() {
  echo "building the application..."
  sh'npm install --legacy-peer-deps'
  sh'ng build'
}

def buildAnsible() {
  echo "building ansible..."
  sh'ansible-playbook ansible/build.yml -i ansible/inventory/host.yml'
}

def buildDocker() {
  echo "building docker..."
  sh'ansible-playbook ansible/docker.yml -i ansible/inventory/host.yml'
}

def pushDockerhub() {
   echo "push the image..."
   sh'ansible-playbook ansible/docker-registry.yml -i ansible/inventory/host.yml'
}

  return this
