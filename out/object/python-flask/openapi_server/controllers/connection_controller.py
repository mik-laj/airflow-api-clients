import connexion
import six

from openapi_server.models.connection import Connection  # noqa: E501
from openapi_server.models.connection_collection import ConnectionCollection  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def create_connection(connection):  # noqa: E501
    """Create connection entry

     # noqa: E501

    :param connection: 
    :type connection: dict | bytes

    :rtype: Connection
    """
    if connexion.request.is_json:
        connection = Connection.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_connection(connection_id):  # noqa: E501
    """Delete a connection entry

     # noqa: E501

    :param connection_id: The Connection ID.
    :type connection_id: int

    :rtype: None
    """
    return 'do some magic!'


def get_connection(connection_id):  # noqa: E501
    """Get a connection entry

     # noqa: E501

    :param connection_id: The Connection ID.
    :type connection_id: int

    :rtype: Connection
    """
    return 'do some magic!'


def get_connections(limit=None, offset=None):  # noqa: E501
    """Get all connection entries

     # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: ConnectionCollection
    """
    return 'do some magic!'


def update_connection(connection_id, connection, update_mask=None):  # noqa: E501
    """Update a connection entry

     # noqa: E501

    :param connection_id: The Connection ID.
    :type connection_id: int
    :param connection: 
    :type connection: dict | bytes
    :param update_mask: The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: Connection
    """
    if connexion.request.is_json:
        connection = Connection.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
