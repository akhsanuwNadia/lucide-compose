package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Leaf") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,20.0f)
                curveTo(16.522848f,20.0f,21.0f,15.522847f,21.0f,10.0f)
                curveTo(21.001453f,7.5358844f,20.651257f,5.0841703f,19.96f,2.7189999f)
                curveTo(19.853954f,2.3570526f,19.553286f,2.0855594f,19.182428f,2.0168822f)
                curveTo(18.811571f,1.9482049f,18.433622f,2.0940278f,18.205f,2.3939998f)
                curveTo(15.833f,5.5f,13.0f,5.5f,9.8f,6.1f)
                curveTo(6.2112308f,6.7131014f,3.691589f,9.974837f,4.004735f,13.602109f)
                curveTo(4.3178806f,17.229382f,7.359253f,20.01103f,11.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                curveTo(1.9994901f,19.046766f,3.136411f,17.27206f,4.9110003f,16.456f)
                curveTo(7.613f,15.212f,8.351f,15.24f,11.0f,13.0f)
            }
}

public val LucideIcons.All.LeafDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Leaf: ImageVector
    @Composable get() = LeafDefinition.asImageVector()
