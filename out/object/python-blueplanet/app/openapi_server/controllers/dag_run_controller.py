import connexion
import six

from app.openapi_server.models.dag_run import DAGRun  # noqa: E501
from app.openapi_server.models.dag_run_collection import DAGRunCollection  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.list_dag_runs_form import ListDagRunsForm  # noqa: E501
from openapi_server import util


def create_dag_run(dag_id, dag_run_id, body):  # noqa: E501
    """Trigger a DAG Run

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: DAGRun
    """
    if connexion.request.is_json:
        body = DAGRun.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_dag_run(dag_id, dag_run_id):  # noqa: E501
    """Delete a DAG Run

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str

    :rtype: None
    """
    return 'do some magic!'


def get_dag_run(dag_id, dag_run_id):  # noqa: E501
    """Get a DAG Run

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str

    :rtype: DAGRun
    """
    return 'do some magic!'


def get_dag_runs(dag_id, limit=None, offset=None, execution_date_gte=None, execution_date_lte=None, start_date_gte=None, start_date_lte=None, end_date_gte=None, end_date_lte=None):  # noqa: E501
    """Get all DAG Runs

    This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
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

    :rtype: DAGRunCollection
    """
    execution_date_gte = util.deserialize_datetime(execution_date_gte)
    execution_date_lte = util.deserialize_datetime(execution_date_lte)
    start_date_gte = util.deserialize_datetime(start_date_gte)
    start_date_lte = util.deserialize_datetime(start_date_lte)
    end_date_gte = util.deserialize_datetime(end_date_gte)
    end_date_lte = util.deserialize_datetime(end_date_lte)
    return 'do some magic!'


def get_dag_runs_batch(body):  # noqa: E501
    """Get all DAG Runs from aall DAGs.

    This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits  # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: DAGRunCollection
    """
    if connexion.request.is_json:
        body = ListDagRunsForm.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_dag_run(dag_id, dag_run_id, body, update_mask=None):  # noqa: E501
    """Update a DAG Run

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG Run ID.
    :type dag_run_id: str
    :param body: 
    :type body: dict | bytes
    :param update_mask: The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: DAGRun
    """
    if connexion.request.is_json:
        body = DAGRun.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
