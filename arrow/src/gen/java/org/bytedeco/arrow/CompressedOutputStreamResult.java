// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("arrow::Result<std::shared_ptr<arrow::io::CompressedOutputStream> >") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class CompressedOutputStreamResult extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompressedOutputStreamResult(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CompressedOutputStreamResult(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CompressedOutputStreamResult position(long position) {
        return (CompressedOutputStreamResult)super.position(position);
    }
    @Override public CompressedOutputStreamResult getPointer(long i) {
        return new CompressedOutputStreamResult((Pointer)this).offsetAddress(i);
    }

  
  ///

  /** Constructs a Result object that contains a non-OK status.
   * 
   *  This constructor is marked {@code explicit} to prevent attempts to {@code return {}}
   *  from a function with a return type of, for example,
   *  {@code Result<std::vector<int>>}. While {@code return {}} seems like it would return
   *  an empty vector, it will actually invoke the default constructor of
   *  Result. */
  public CompressedOutputStreamResult() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();

  /** Constructs a Result object with the given non-OK Status object. All
   *  calls to ValueOrDie() on this object will abort. The given {@code status} must
   *  not be an OK status, otherwise this constructor will abort.
   * 
   *  This constructor is not declared explicit so that a function with a return
   *  type of {@code Result<T>} can return a Status object, and the status will be
   *  implicitly converted to the appropriate return type as a matter of
   *  convenience.
   * 
   *  @param status The non-OK Status object to initialize to. */
  
  ///
  ///
  ///
  public CompressedOutputStreamResult(@Const @ByRef Status status) { super((Pointer)null); allocate(status); }
  @NoException(true) private native void allocate(@Const @ByRef Status status);

  /** Constructs a Result object that contains {@code value}. The resulting object
   *  is considered to have an OK status. The wrapped element can be accessed
   *  with ValueOrDie().
   * 
   *  This constructor is made implicit so that a function with a return type of
   *  {@code Result<T>} can return an object of type {@code U &&}, implicitly converting
   *  it to a {@code Result<T>} object.
   * 
   *  Note that {@code T} must be implicitly constructible from {@code U}, and {@code U} must not
   *  be a (cv-qualified) Status or Status-reference type. Due to C++
   *  reference-collapsing rules and perfect-forwarding semantics, this
   *  constructor matches invocations that pass {@code value} either as a const
   *  reference or as an rvalue reference. Since Result needs to work for both
   *  reference and rvalue-reference types, the constructor uses perfect
   *  forwarding to avoid invalidating arguments that were passed by reference.
   *  See http://thbecker.net/articles/rvalue_references/section_08.html for
   *  additional details.
   * 
   *  @param value The value to initialize to. */

  /** Constructs a Result object that contains {@code value}. The resulting object
   *  is considered to have an OK status. The wrapped element can be accessed
   *  with ValueOrDie().
   * 
   *  This constructor is made implicit so that a function with a return type of
   *  {@code Result<T>} can return an object of type {@code T}, implicitly converting
   *  it to a {@code Result<T>} object.
   * 
   *  @param value The value to initialize to. */
  // NOTE `Result(U&& value)` above should be sufficient, but some compilers
  // fail matching it.
  
  ///
  ///
  public CompressedOutputStreamResult(@SharedPtr CompressedOutputStream value) { super((Pointer)null); allocate(value); }
  @NoException(true) private native void allocate(@SharedPtr CompressedOutputStream value);

  /** Copy constructor.
   * 
   *  This constructor needs to be explicitly defined because the presence of
   *  the move-assignment operator deletes the default copy constructor. In such
   *  a scenario, since the deleted copy constructor has stricter binding rules
   *  than the templated copy constructor, the templated constructor cannot act
   *  as a copy constructor, and any attempt to copy-construct a {@code Result}
   *  object results in a compilation error.
   * 
   *  @param other The value to copy from. */
  
  ///
  ///
  public CompressedOutputStreamResult(@Const @ByRef CompressedOutputStreamResult other) { super((Pointer)null); allocate(other); }
  @NoException(true) private native void allocate(@Const @ByRef CompressedOutputStreamResult other);

  /** Templatized constructor that constructs a {@code Result<T>} from a const
   *  reference to a {@code Result<U>}.
   * 
   *  {@code T} must be implicitly constructible from {@code const U &}.
   * 
   *  @param other The value to copy from. */

  /** Copy-assignment operator.
   * 
   *  @param other The Result object to copy. */
  
  ///
  ///
  public native @ByRef @Name("operator =") @NoException(true) CompressedOutputStreamResult put(@Const @ByRef CompressedOutputStreamResult other);

  /** Templatized constructor which constructs a {@code Result<T>} by moving the
   *  contents of a {@code Result<U>}. {@code T} must be implicitly constructible from {@code U
   *  &&}.
   * 
   *  Sets {@code other} to contain a non-OK status with a{@code StatusError::Invalid}
   *  error code.
   * 
   *  @param other The Result object to move from and set to a non-OK status. */

  /** Move-assignment operator.
   * 
   *  Sets {@code other} to an invalid state..
   * 
   *  @param other The Result object to assign from and set to a non-OK
   *  status. */

  /** Compare to another Result. */
  
  ///
  public native @Cast("bool") boolean Equals(@Const @ByRef CompressedOutputStreamResult other);

  /** Indicates whether the object contains a {@code T} value.  Generally instead
   *  of accessing this directly you will want to use ASSIGN_OR_RAISE defined
   *  below.
   * 
   *  @return True if this Result object's status is OK (i.e. a call to ok()
   *  returns true). If this function returns true, then it is safe to access
   *  the wrapped element through a call to ValueOrDie(). */
  
  ///
  public native @Cast("const bool") boolean ok();

  /** \brief Equivalent to ok(). */
  // operator bool() const { return ok(); }

  /** Gets the stored status object, or an OK status if a {@code T} value is stored.
  /**
  /** @return The stored non-OK status object, or an OK status if this object
  /**         has a value. */
  
  ///
  ///
  public native @Const @ByRef Status status();

  /** Gets the stored {@code T} value.
   * 
   *  This method should only be called if this Result object's status is OK
   *  (i.e. a call to ok() returns true), otherwise this call will abort.
   * 
   *  @return The stored {@code T} value. */

  /** Gets a mutable reference to the stored {@code T} value.
   * 
   *  This method should only be called if this Result object's status is OK
   *  (i.e. a call to ok() returns true), otherwise this call will abort.
   * 
   *  @return The stored {@code T} value. */
  public native @SharedPtr CompressedOutputStream ValueOrDie();
  public native @SharedPtr @Name("operator *") CompressedOutputStream multiply();
  
  ///
  ///
  public native @SharedPtr @Name("operator ->") CompressedOutputStream access();

  /** Moves and returns the internally-stored {@code T} value.
   * 
   *  This method should only be called if this Result object's status is OK
   *  (i.e. a call to ok() returns true), otherwise this call will abort. The
   *  Result object is invalidated after this call and will be updated to
   *  contain a non-OK status.
   * 
   *  @return The stored {@code T} value. */
  
  

  /** Helper method for implementing Status returning functions in terms of semantically
   *  equivalent Result returning functions. For example:
   * 
   *  Status GetInt(int *out) { return GetInt().Value(out); } */
  

  /** Move and return the internally stored value or alternative if an error is stored. */
  

  /** Retrieve the value if ok(), falling back to an alternative generated by the provided
   *  factory */
  

  /** Apply a function to the internally stored value to produce a new result or propagate
   *  the stored error. */
  

  /** Apply a function to the internally stored value to produce a new result or propagate
   *  the stored error. */

  /** Cast the internally stored value to produce a new result or propagate the stored
   *  error. */
  

  /** Cast the internally stored value to produce a new result or propagate the stored
   *  error. */

// #if __cpp_constexpr >= 201304L  // non-const constexpr
  public native @SharedPtr CompressedOutputStream ValueUnsafe();
// #else
// #endif

  

  public native @SharedPtr CompressedOutputStream MoveValueUnsafe();
}
