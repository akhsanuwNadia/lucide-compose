package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.639365f,1.9989636f,15.252715f,2.2530863f,15.704f,2.7059999f)
                lineTo(19.292f,6.2939997f)
                curveTo(19.74614f,6.745444f,20.00104f,7.3596535f,20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,14.5f)
                curveTo(8.995994f,15.395827f,9.471613f,16.225325f,10.246761f,16.6744f)
                curveTo(11.02191f,17.123474f,11.97809f,17.123474f,12.753239f,16.6744f)
                curveTo(13.528387f,16.225325f,14.004006f,15.395827f,14.0f,14.5f)
                curveTo(14.004006f,13.604173f,13.528387f,12.774674f,12.753239f,12.325601f)
                curveTo(11.97809f,11.876526f,11.02191f,11.876526f,10.246761f,12.325601f)
                curveTo(9.471613f,12.774674f,8.995994f,13.604173f,9.0f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.3f,16.3f)
                lineTo(15.0f,18.0f)
            }
}

public val LucideIcons.All.FileSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileSearch: ImageVector
    @Composable get() = FileSearchDefinition.asImageVector()
