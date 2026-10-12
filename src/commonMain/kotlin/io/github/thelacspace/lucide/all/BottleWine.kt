package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BottleWine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                curveTo(10.0f,2.4477153f,10.447715f,2.0f,11.0f,2.0f)
                lineTo(13.0f,2.0f)
                curveTo(13.552285f,2.0f,14.0f,2.4477153f,14.0f,3.0f)
                lineTo(14.0f,5.0f)
                curveTo(14.0f,6.2982216f,14.421067f,7.5614233f,15.2f,8.6f)
                lineTo(15.8f,9.400001f)
                curveTo(16.578934f,10.438578f,17.0f,11.701779f,17.0f,13.0f)
                lineTo(17.0f,21.0f)
                curveTo(17.0f,21.552284f,16.552284f,22.0f,16.0f,22.0f)
                lineTo(8.0f,22.0f)
                curveTo(7.4477153f,22.0f,7.0f,21.552284f,7.0f,21.0f)
                lineTo(7.0f,13.0f)
                curveTo(7.0f,11.701778f,7.421067f,10.438577f,8.2f,9.4f)
                lineTo(8.8f,8.599999f)
                curveTo(9.578933f,7.5614223f,10.0f,6.298221f,10.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,13.0f)
                lineTo(13.0f,13.0f)
                curveTo(12.447715f,13.0f,12.0f,13.447715f,12.0f,14.0f)
                lineTo(12.0f,17.0f)
                curveTo(12.0f,17.552284f,12.447715f,18.0f,13.0f,18.0f)
                lineTo(17.0f,18.0f)
            }
}

public val LucideIcons.All.BottleWineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BottleWine: ImageVector
    @Composable get() = BottleWineDefinition.asImageVector()
