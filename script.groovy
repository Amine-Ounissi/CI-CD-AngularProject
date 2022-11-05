def buildJar() {
  echo "building the application..."
  sh'npm install --legacy-peer-deps'
  sh'ng build'
}

  return this
