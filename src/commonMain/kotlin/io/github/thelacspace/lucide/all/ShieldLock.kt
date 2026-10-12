package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,9.807f)
                lineTo(20.0f,6.0f)
                curveTo(20.0f,5.4477153f,19.552284f,5.0f,19.0f,5.0f)
                curveTo(17.0f,5.0f,14.51f,3.81f,12.76f,2.28f)
                curveTo(12.322327f,1.906067f,11.677673f,1.906067f,11.24f,2.28f)
                curveTo(9.5f,3.8f,7.0f,5.0f,5.0f,5.0f)
                curveTo(4.4477153f,5.0f,4.0f,5.4477153f,4.0f,6.0f)
                lineTo(4.0f,13.0f)
                curveTo(4.0f,16.880001f,6.1070004f,19.254f,9.0f,20.796f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,17.0f)
                lineTo(19.0f,15.0f)
                curveTo(18.995075f,13.898922f,18.10109f,13.0089245f,17.0f,13.0089245f)
                curveTo(15.8989105f,13.0089245f,15.004924f,13.898922f,15.0f,15.0f)
                lineTo(15.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,17.0f)
                lineTo(20.0f,17.0f)
                lineTo(21.0f,17.0f)
                lineTo(21.0f,22.0f)
                lineTo(20.0f,22.0f)
                lineTo(14.0f,22.0f)
                lineTo(13.0f,22.0f)
                lineTo(13.0f,17.0f)
                lineTo(14.0f,17.0f)
                close()
            }
}

public val LucideIcons.All.ShieldLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldLock: ImageVector
    @Composable get() = ShieldLockDefinition.asImageVector()
