package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                curveTo(12.761f,22.0f,15.0f,20.21f,15.0f,18.0f)
                curveTo(10.58f,18.0f,10.92f,13.0f,6.5f,13.0f)
                curveTo(4.887511f,12.992788f,3.394414f,13.848904f,2.5860806f,15.24417f)
                curveTo(1.7777469f,16.639439f,1.7777469f,18.360561f,2.5860806f,19.755829f)
                curveTo(3.394414f,21.151096f,4.887511f,22.007212f,6.5f,22.0f)
                close()
                lineTo(10.0f,22.0f)
                curveTo(8.343145f,22.0f,7.0f,20.656855f,7.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5f,11.5f)
                lineTo(22.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.98f,13.02f)
                lineTo(9.645f,10.356001f)
                curveTo(10.117397f,9.884265f,10.882604f,9.884265f,11.3550005f,10.356001f)
                lineTo(13.645f,12.644001f)
                curveTo(13.872165f,12.870953f,13.999803f,13.178892f,13.999803f,13.500001f)
                curveTo(13.999803f,13.82111f,13.872165f,14.129049f,13.645f,14.356001f)
                lineTo(11.557f,16.443f)
            }
}

public val LucideIcons.All.MopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mop: ImageVector
    @Composable get() = MopDefinition.asImageVector()
