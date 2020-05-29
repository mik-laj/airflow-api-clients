import connexion
import six

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.extra_link_collection import ExtraLinkCollection  # noqa: E501
from openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_server.models.list_task_instance_form import ListTaskInstanceForm  # noqa: E501
from openapi_server.models.task_instance import TaskInstance  # noqa: E501
from openapi_server.models.task_instance_collection import TaskInstanceCollection  # noqa: E501
from openapi_server import util


def get_extra_links(dag_id, dag_run_id, task_id):  # noqa: E501
    """Get extra links for task instance

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param task_id: The Task ID.
    :type task_id: str

    :rtype: ExtraLinkCollection
    """
    return 'do some magic!'


def get_logs(dag_id, dag_run_id, task_id, task_try_number, full_content=None, token=None):  # noqa: E501
    """Get logs for a task instance

    Get logs for a specific task instance and its try number # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param task_id: The Task ID.
    :type task_id: str
    :param task_try_number: The Task Try Number.
    :type task_try_number: int
    :param full_content: A full content will be returned. By default, only the first fragment will be returned. 
    :type full_content: bool
    :param token: A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued. 
    :type token: str

    :rtype: InlineResponse200
    """
    return 'do some magic!'


def get_task_instance(dag_id, dag_run_id, task_id):  # noqa: E501
    """Get a task instance

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param task_id: The Task ID.
    :type task_id: str

    :rtype: TaskInstance
    """
    return 'do some magic!'


def get_task_instances(dag_id, dag_run_id, execution_date_gte=None, execution_date_lte=None, start_date_gte=None, start_date_lte=None, end_date_gte=None, end_date_lte=None, duration_gte=None, duration_lte=None, state=None, pool=None, queue=None, limit=None, offset=None):  # noqa: E501
    """Get a list of task instance of DAG.

    This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param execution_date_gte: Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period. 
    :type execution_date_gte: str
    :param execution_date_lte: Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period. 
    :type execution_date_lte: str
    :param start_date_gte: Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period. 
    :type start_date_gte: str
    :param start_date_lte: Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period. 
    :type start_date_lte: str
    :param end_date_gte: Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period. 
    :type end_date_gte: str
    :param end_date_lte: Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period. 
    :type end_date_lte: str
    :param duration_gte: Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period. 
    :type duration_gte: 
    :param duration_lte: Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range. 
    :type duration_lte: 
    :param state: The value can be repeated to retrieve multiple matching values (OR condition).
    :type state: List[str]
    :param pool: The value can be repeated to retrieve multiple matching values (OR condition).
    :type pool: List[str]
    :param queue: The value can be repeated to retrieve multiple matching values (OR condition).
    :type queue: List[str]
    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: TaskInstanceCollection
    """
    execution_date_gte = util.deserialize_datetime(execution_date_gte)
    execution_date_lte = util.deserialize_datetime(execution_date_lte)
    start_date_gte = util.deserialize_datetime(start_date_gte)
    start_date_lte = util.deserialize_datetime(start_date_lte)
    end_date_gte = util.deserialize_datetime(end_date_gte)
    end_date_lte = util.deserialize_datetime(end_date_lte)
    return 'do some magic!'


def get_task_instances_batch(list_task_instance_form):  # noqa: E501
    """Get list of task instances from all DAGs and DAG Runs.

    This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits  # noqa: E501

    :param list_task_instance_form: 
    :type list_task_instance_form: dict | bytes

    :rtype: TaskInstanceCollection
    """
    if connexion.request.is_json:
        list_task_instance_form = ListTaskInstanceForm.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
