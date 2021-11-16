/**
 * Copyright (c) 2021 TNO/ESI
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *     TNO/ESI - initial API and implementation
 *     Obeo - refactoring
 */
package org.eclipse.poosl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.poosl.GuardedStatement;
import org.eclipse.poosl.PooslFactory;
import org.eclipse.poosl.PooslPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.poosl.GuardedStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GuardedStatementItemProvider extends StatementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedStatementItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(PooslPackage.Literals.GUARDED_STATEMENT__GUARD);
			childrenFeatures.add(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GuardedStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GuardedStatement")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_GuardedStatement_type"); //$NON-NLS-1$
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(GuardedStatement.class))
		{
			case PooslPackage.GUARDED_STATEMENT__GUARD:
			case PooslPackage.GUARDED_STATEMENT__STATEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createExpressionSequence()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createExpressionSequenceRoundBracket()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createCurrentTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createDataMethodCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createNewExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createSelfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createBinaryOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createUnaryOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createCharacterConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createNilConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createRealConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createFloatConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__GUARD,
				 PooslFactory.eINSTANCE.createEnvironmentConstant()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createStatementSequence()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createStatementSequenceRoundBracket()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createAbortStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createDelayStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createExpressionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createGuardedStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createSwitchStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createInterruptStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createParStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createProcessMethodCall()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createReceiveStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createSendStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createSelStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createSkipStatement()));

		newChildDescriptors.add
			(createChildParameter
				(PooslPackage.Literals.GUARDED_STATEMENT__STATEMENT,
				 PooslFactory.eINSTANCE.createWhileStatement()));
	}

}
