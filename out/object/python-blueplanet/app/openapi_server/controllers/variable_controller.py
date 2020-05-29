import connexion
import six

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.variable import Variable  # noqa: E501
from app.openapi_server.models.variable_collection import VariableCollection  # noqa: E501
from openapi_server import util


def create_variable(body):  # noqa: E501
    """Create a variable

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: Variable
    """
    if connexion.request.is_json:
        body = Variable.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_variable(variable_key):  # noqa: E501
    """Delete variable

     # noqa: E501

    :param variable_key: The Variable Key.
    :type variable_key: str

    :rtype: None
    """
    return 'do some magic!'


def get_variable(variable_key):  # noqa: E501
    """Get a variable by key

     # noqa: E501

    :param variable_key: The Variable Key.
    :type variable_key: str

    :rtype: Variable
    """
    return 'do some magic!'


def get_variables(limit=None, offset=None):  # noqa: E501
    """Get all variables

    The collection does not contain data. To get data, you must get a single entity. # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: VariableCollection
    """
    return 'do some magic!'


def update_variable(variable_key, body, update_mask=None):  # noqa: E501
    """Update a variable by key

     # noqa: E501

    :param variable_key: The Variable Key.
    :type variable_key: str
    :param body: 
    :type body: dict | bytes
    :param update_mask: The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: Variable
    """
    if connexion.request.is_json:
        body = Variable.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
