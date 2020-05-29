import connexion
import six

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.import_error import ImportError  # noqa: E501
from openapi_server.models.import_error_collection import ImportErrorCollection  # noqa: E501
from openapi_server import util


def delete_import_error(import_error_id):  # noqa: E501
    """Delete an import error

     # noqa: E501

    :param import_error_id: The Import Error ID.
    :type import_error_id: int

    :rtype: None
    """
    return 'do some magic!'


def get_import_error(import_error_id):  # noqa: E501
    """Get an import error

     # noqa: E501

    :param import_error_id: The Import Error ID.
    :type import_error_id: int

    :rtype: ImportError
    """
    return 'do some magic!'


def get_import_errors(limit=None, offset=None):  # noqa: E501
    """Get all import errors

     # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: ImportErrorCollection
    """
    return 'do some magic!'
