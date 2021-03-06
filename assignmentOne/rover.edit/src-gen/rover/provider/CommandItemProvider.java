/**
 */
package rover.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import rover.RoverPackage;

/**
 * This is the item provider adapter for a {@link rover.Command} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRepeatePropertyDescriptor(object);
			addTermintatePropertyDescriptor(object);
			addStartPropertyDescriptor(object);
			addRotatePropertyDescriptor(object);
			addMovePropertyDescriptor(object);
			addWaitPropertyDescriptor(object);
			addSetlightcolorPropertyDescriptor(object);
			addOutgoingTransitionPropertyDescriptor(object);
			addIncomingTransitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Repeate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepeatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Command_repeate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Command_repeate_feature",
								"_UI_Command_type"),
						RoverPackage.Literals.COMMAND__REPEATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Termintate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTermintatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Command_termintate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Command_termintate_feature",
								"_UI_Command_type"),
						RoverPackage.Literals.COMMAND__TERMINTATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Command_start_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Command_start_feature",
								"_UI_Command_type"),
						RoverPackage.Literals.COMMAND__START, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Rotate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRotatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Command_rotate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Command_rotate_feature",
								"_UI_Command_type"),
						RoverPackage.Literals.COMMAND__ROTATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Move feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMovePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Command_move_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Command_move_feature", "_UI_Command_type"),
						RoverPackage.Literals.COMMAND__MOVE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Wait feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Command_wait_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Command_wait_feature", "_UI_Command_type"),
						RoverPackage.Literals.COMMAND__WAIT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Setlightcolor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetlightcolorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Command_setlightcolor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Command_setlightcolor_feature",
								"_UI_Command_type"),
						RoverPackage.Literals.COMMAND__SETLIGHTCOLOR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingTransitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Command_outgoingTransition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Command_outgoingTransition_feature",
								"_UI_Command_type"),
						RoverPackage.Literals.COMMAND__OUTGOING_TRANSITION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Incoming Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingTransitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Command_incomingTransition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Command_incomingTransition_feature",
								"_UI_Command_type"),
						RoverPackage.Literals.COMMAND__INCOMING_TRANSITION, true, false, true, null, null, null));
	}

	/**
	 * This returns Command.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Command"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Command_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RoverEditPlugin.INSTANCE;
	}

}
