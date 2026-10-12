package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Atom") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                curveTo(10.998398f,12.358331f,11.188645f,12.69013f,11.498705f,12.86976f)
                curveTo(11.8087635f,13.04939f,12.1912365f,13.04939f,12.501295f,12.86976f)
                curveTo(12.811355f,12.69013f,13.001602f,12.358331f,13.0f,12.0f)
                curveTo(13.001602f,11.641669f,12.811355f,11.30987f,12.501295f,11.13024f)
                curveTo(12.1912365f,10.95061f,11.8087635f,10.95061f,11.498705f,11.13024f)
                curveTo(11.188645f,11.30987f,10.998398f,11.641669f,11.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.2f,20.2f)
                curveTo(22.240002f,18.17f,20.220001f,12.84f,15.700001f,8.300001f)
                curveTo(11.160001f,3.7800012f,5.830001f,1.7600012f,3.8000011f,3.8000011f)
                curveTo(1.7600012f,5.830001f,3.7800012f,11.160002f,8.300001f,15.700001f)
                curveTo(12.840001f,20.220001f,18.170002f,22.240002f,20.2f,20.2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.7f,15.7f)
                curveTo(20.22f,11.16f,22.24f,5.83f,20.2f,3.8000002f)
                curveTo(18.17f,1.7600002f,12.84f,3.7800002f,8.300001f,8.3f)
                curveTo(3.7800012f,12.84f,1.7600012f,18.17f,3.8000011f,20.2f)
                curveTo(5.830001f,22.240002f,11.160002f,20.220001f,15.700001f,15.700001f)
                close()
            }
}

public val LucideIcons.All.AtomDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Atom: ImageVector
    @Composable get() = AtomDefinition.asImageVector()
