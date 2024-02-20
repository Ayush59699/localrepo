import os
from app import create_app
#from app.models import *
from flask_migrate import Migrate
from config import DevelopmentConfig


app=create_app(DevelopmentConfig)

app=create_app(os.getenv("FLASK_CONFIG") or 'default')
#migrate=Migrate(app,db)


"""
@app.shell_context_processor
def make_shell_context():
    return dict(db=db, User=user, Role=Role)
"""


if __name__=="__main__":
    app.run(port=6969, debug=True)






"""
db.create_all()
"""
