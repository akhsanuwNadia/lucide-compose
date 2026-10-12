package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PocketKnife") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,2.0f)
                lineTo(3.0f,3.0f)
                curveTo(3.0f,4.0f,5.0f,4.0f,5.0f,5.0f)
                curveTo(5.0f,6.0f,3.0f,6.0f,3.0f,7.0f)
                curveTo(3.0f,8.0f,5.0f,8.0f,5.0f,9.0f)
                curveTo(5.0f,10.0f,3.0f,10.0f,3.0f,11.0f)
                curveTo(3.0f,12.0f,5.0f,12.0f,5.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,6.0f)
                lineTo(18.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(6.01f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.83f,8.83f)
                curveTo(22.381058f,7.2650065f,22.375414f,4.7406693f,20.817371f,3.182628f)
                curveTo(19.25933f,1.6245868f,16.734993f,1.6189423f,15.17f,3.17f)
                lineTo(3.17f,15.17f)
                curveTo(2.1513884f,16.17954f,1.7507974f,17.656935f,2.1199136f,19.042755f)
                curveTo(2.4890296f,20.428574f,3.5714257f,21.510971f,4.957246f,21.880087f)
                curveTo(6.3430657f,22.249203f,7.8204584f,21.848612f,8.83f,20.83f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,11.66f)
                lineTo(18.0f,22.0f)
                curveTo(20.209139f,22.0f,22.0f,20.209139f,22.0f,18.0f)
                lineTo(22.0f,6.0f)
            }
}

public val LucideIcons.All.PocketKnifeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PocketKnife: ImageVector
    @Composable get() = PocketKnifeDefinition.asImageVector()
