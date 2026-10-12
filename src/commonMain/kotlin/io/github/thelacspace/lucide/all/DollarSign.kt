package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DollarSign") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,5.0)
                lineTo(9.5,5.0)
                curveTo(7.573112964630127,5.008617401123047,6.015617370605469,6.573093891143799,6.015617370605469,8.5)
                curveTo(6.015617370605469,10.426905632019043,7.573112964630127,11.991382598876953,9.5,12.0)
                lineTo(14.5,12.0)
                curveTo(16.42688751220703,12.008617401123047,17.98438262939453,13.573094367980957,17.98438262939453,15.5)
                curveTo(17.98438262939453,17.42690658569336,16.42688751220703,18.991382598876953,14.5,19.0)
                lineTo(6.0,19.0)
            }
}

public val LucideIcons.All.DollarSignDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DollarSign: ImageVector
    @Composable get() = DollarSignDefinition.asImageVector()
