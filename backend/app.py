from flask import Flask, jsonify
from org.python.util import PythonObjectFactory
from java_integration import MyJavaClass

app = Flask(__name__)

@app.route('/')
def hello():
    return "Hello from Python!"

@app.route('/java-api')
def get_data_from_java():
    factory = PythonObjectFactory()
    py_instance = factory.createObject(MyJavaClass)
    java_data = py_instance.getJavaData()
    return jsonify({"data": java_data})

if __name__ == '__main__':
    app.run()
