package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldQuestionMark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,13.0f)
                curveTo(20.0f,18.0f,16.5f,20.5f,12.34f,21.95f)
                curveTo(12.122163f,22.023819f,11.885537f,22.020287f,11.67f,21.94f)
                curveTo(7.5f,20.5f,4.0f,18.0f,4.0f,13.0f)
                lineTo(4.0f,6.0f)
                curveTo(4.0f,5.4477153f,4.4477153f,5.0f,5.0f,5.0f)
                curveTo(7.0f,5.0f,9.5f,3.8f,11.24f,2.28f)
                curveTo(11.677673f,1.906067f,12.322327f,1.906067f,12.76f,2.28f)
                curveTo(14.51f,3.81f,17.0f,5.0f,19.0f,5.0f)
                curveTo(19.552284f,5.0f,20.0f,5.4477153f,20.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.1f,9.0f)
                curveTo(9.595283f,7.635031f,10.997032f,6.8207126f,12.42811f,7.066602f)
                curveTo(13.859187f,7.312492f,14.908734f,8.547996f,14.92f,10.0f)
                curveTo(14.92f,12.0f,11.92f,13.0f,11.92f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.01f,17.0f)
            }
}

public val LucideIcons.All.ShieldQuestionMarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldQuestionMark: ImageVector
    @Composable get() = ShieldQuestionMarkDefinition.asImageVector()
