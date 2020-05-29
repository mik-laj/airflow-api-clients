import connexion
import six

from app.openapi_server.models.config import Config  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def get_config(limit=None, offset=None):  # noqa: E501
    """Get current configuration

     # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: Config
    """
    return 'do some magic!'
