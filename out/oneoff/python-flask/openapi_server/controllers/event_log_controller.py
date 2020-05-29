import connexion
import six

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.event_log import EventLog  # noqa: E501
from openapi_server.models.event_log_collection import EventLogCollection  # noqa: E501
from openapi_server import util


def get_event_log(limit=None, offset=None):  # noqa: E501
    """Get all log entries from event log

     # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: EventLogCollection
    """
    return 'do some magic!'


def get_event_log_entry(event_log_id):  # noqa: E501
    """Get a log entry

     # noqa: E501

    :param event_log_id: The Event Log ID.
    :type event_log_id: int

    :rtype: EventLog
    """
    return 'do some magic!'
