package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Galaxy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.005f,15.108f)
                curveTo(17.974285f,12.137358f,17.79245f,8.373405f,15.597326f,6.6692243f)
                curveTo(13.402203f,4.9650435f,10.012224f,5.956023f,7.996999f,8.891f)
                curveTo(6.027714f,11.861642f,6.2095485f,15.625594f,8.404672f,17.329775f)
                curveTo(10.599795f,19.033957f,13.989774f,18.042976f,16.005f,15.108f)
                curveTo(12.560367f,19.830582f,7.765678f,21.824865f,4.7554145f,19.787106f)
                curveTo(1.745151f,17.749346f,1.4355457f,12.299776f,4.029f,7.001f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                lineTo(17.01f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.0f)
                lineTo(7.01f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.997f,8.891f)
                curveTo(11.442054f,4.165242f,16.239082f,2.168504f,19.250422f,4.2068214f)
                curveTo(22.261759f,6.245139f,22.570202f,11.697672f,19.974f,16.998001f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                curveTo(10.998398f,12.358331f,11.188645f,12.69013f,11.498705f,12.86976f)
                curveTo(11.8087635f,13.04939f,12.1912365f,13.04939f,12.501295f,12.86976f)
                curveTo(12.811355f,12.69013f,13.001602f,12.358331f,13.0f,12.0f)
                curveTo(13.001602f,11.641669f,12.811355f,11.30987f,12.501295f,11.13024f)
                curveTo(12.1912365f,10.95061f,11.8087635f,10.95061f,11.498705f,11.13024f)
                curveTo(11.188645f,11.30987f,10.998398f,11.641669f,11.0f,12.0f)
            }
}

public val LucideIcons.All.GalaxyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Galaxy: ImageVector
    @Composable get() = GalaxyDefinition.asImageVector()
