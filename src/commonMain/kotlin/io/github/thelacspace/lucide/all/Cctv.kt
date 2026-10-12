package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cctv") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.75f,12.0f)
                lineTo(20.382f,12.0f)
                curveTo(20.72844f,12.000185f,21.050104f,12.179668f,21.232195f,12.474395f)
                curveTo(21.414286f,12.769121f,21.430859f,13.137098f,21.276f,13.4470005f)
                lineTo(19.241999f,17.516f)
                curveTo(19.085127f,17.829617f,18.775446f,18.03815f,18.42586f,18.065578f)
                curveTo(18.076271f,18.093004f,17.73786f,17.935316f,17.533998f,17.650002f)
                lineTo(15.409998f,14.680001f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.106f,9.053f)
                curveTo(17.599527f,9.300058f,17.799587f,9.900237f,17.553001f,10.394f)
                lineTo(14.447001f,16.605f)
                curveTo(14.328356f,16.842274f,14.120293f,17.022678f,13.868604f,17.106514f)
                curveTo(13.616915f,17.190348f,13.342229f,17.170738f,13.105001f,17.052f)
                lineTo(3.61f,12.3f)
                curveTo(2.1741815f,11.576775f,1.5930711f,9.828973f,2.31f,8.39f)
                lineTo(3.69f,5.6f)
                curveTo(4.037372f,4.907726f,4.6455545f,4.3818254f,5.380721f,4.1380205f)
                curveTo(6.1158876f,3.894215f,6.9177995f,3.9524822f,7.61f,4.3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,19.0f)
                lineTo(5.76f,19.0f)
                curveTo(6.520314f,19.005291f,7.2178693f,18.579008f,7.5600004f,17.9f)
                lineTo(9.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(2.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,9.0f)
                lineTo(7.01f,9.0f)
            }
}

public val LucideIcons.All.CctvDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cctv: ImageVector
    @Composable get() = CctvDefinition.asImageVector()
