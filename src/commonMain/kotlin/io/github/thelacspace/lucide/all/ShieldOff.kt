package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,5.0f)
                curveTo(4.4477153f,5.0f,4.0f,5.4477153f,4.0f,6.0f)
                lineTo(4.0f,13.0f)
                curveTo(4.0f,18.0f,7.5f,20.5f,11.67f,21.939999f)
                curveTo(11.885537f,22.020285f,12.122163f,22.023817f,12.34f,21.949999f)
                curveTo(14.690001f,21.13f,16.82f,19.98f,18.24f,18.239998f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.309f,3.652f)
                curveTo(9.99547f,3.2581089f,10.642158f,2.7986288f,11.24f,2.28f)
                curveTo(11.677673f,1.906067f,12.322327f,1.906067f,12.76f,2.28f)
                curveTo(14.51f,3.81f,17.0f,5.0f,19.0f,5.0f)
                curveTo(19.552284f,5.0f,20.0f,5.4477153f,20.0f,6.0f)
                lineTo(20.0f,13.0f)
                curveTo(20.00066f,13.422619f,19.973938f,13.844836f,19.92f,14.264f)
            }
}

public val LucideIcons.All.ShieldOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldOff: ImageVector
    @Composable get() = ShieldOffDefinition.asImageVector()
