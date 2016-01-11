package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.bfm.util.HibernateUtil;

/**
 * Home object for domain model class Tbinstrdeal.
 * @see com.bfm.db.bean.Tbinstrdeal
 * @author Hibernate Tools
 */
public class TbinstrdealHome {

	private static final Log log = LogFactory.getLog(TbinstrdealHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstrdeal transientInstance) {
		log.debug("persisting Tbinstrdeal instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstrdeal instance) {
		log.debug("attaching dirty Tbinstrdeal instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstrdeal instance) {
		log.debug("attaching clean Tbinstrdeal instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstrdeal persistentInstance) {
		log.debug("deleting Tbinstrdeal instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstrdeal merge(Tbinstrdeal detachedInstance) {
		log.debug("merging Tbinstrdeal instance");
		try {
			Tbinstrdeal result = (Tbinstrdeal) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstrdeal findById(java.lang.String id) {
		log.debug("getting Tbinstrdeal instance with id: " + id);
		try {
			Tbinstrdeal instance = (Tbinstrdeal) sessionFactory
					.getCurrentSession().get("com.bfm.db.bean.Tbinstrdeal", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbinstrdeal instance) {
		log.debug("finding Tbinstrdeal instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstrdeal")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
