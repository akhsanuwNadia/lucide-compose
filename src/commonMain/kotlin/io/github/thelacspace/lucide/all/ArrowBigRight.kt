package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.207f,19.793f)
                curveTo(13.004797f,19.995264f,12.70065f,20.05578f,12.436422f,19.946325f)
                curveTo(12.1721945f,19.836868f,11.999939f,19.579f,12.0f,19.293f)
                lineTo(12.0f,16.0f)
                curveTo(12.0f,15.447715f,11.552285f,15.0f,11.0f,15.0f)
                lineTo(5.0f,15.0f)
                curveTo(4.4477153f,15.0f,4.0f,14.552285f,4.0f,14.0f)
                lineTo(4.0f,10.0f)
                curveTo(4.0f,9.447715f,4.4477153f,9.0f,5.0f,9.0f)
                lineTo(11.0f,9.0f)
                curveTo(11.552285f,9.0f,12.0f,8.552285f,12.0f,8.0f)
                lineTo(12.0f,4.707f)
                curveTo(11.999939f,4.420998f,12.1721945f,4.163131f,12.436422f,4.0536747f)
                curveTo(12.70065f,3.9442182f,13.004797f,4.0047355f,13.207f,4.207f)
                lineTo(20.147f,11.146999f)
                curveTo(20.37337f,11.373358f,20.500544f,11.680372f,20.500544f,12.0005f)
                curveTo(20.500544f,12.320626f,20.37337f,12.627641f,20.147f,12.853999f)
                close()
            }
}

public val LucideIcons.All.ArrowBigRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigRight: ImageVector
    @Composable get() = ArrowBigRightDefinition.asImageVector()
