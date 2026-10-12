package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacAquarius") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(4.4560003f,6.316f)
                curveTo(4.5865793f,6.1435685f,4.789537f,6.0411863f,5.0058165f,6.0386443f)
                curveTo(5.2220964f,6.0361023f,5.4274044f,6.1336856f,5.5620003f,6.303f)
                lineTo(7.9520006f,9.716f)
                curveTo(8.08495f,9.882965f,8.28681f,9.980153f,8.500242f,9.979959f)
                curveTo(8.713674f,9.979764f,8.915356f,9.882207f,9.048f,9.714999f)
                lineTo(11.450001f,6.282999f)
                curveTo(11.582764f,6.115165f,11.785005f,6.017279f,11.999001f,6.017279f)
                curveTo(12.2129965f,6.017279f,12.415237f,6.115165f,12.548f,6.282999f)
                lineTo(14.950001f,9.714999f)
                curveTo(15.082764f,9.8828335f,15.285005f,9.980719f,15.499001f,9.980719f)
                curveTo(15.7129965f,9.980719f,15.915237f,9.8828335f,16.048f,9.714999f)
                lineTo(18.437f,6.301999f)
                curveTo(18.571596f,6.132685f,18.776903f,6.035102f,18.993183f,6.037644f)
                curveTo(19.209463f,6.0401864f,19.41242f,6.142568f,19.543f,6.314999f)
                lineTo(22.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.002f)
                lineTo(4.4560003f,14.318001f)
                curveTo(4.5865793f,14.14557f,4.789537f,14.043187f,5.005817f,14.040646f)
                curveTo(5.2220964f,14.038103f,5.4274044f,14.135687f,5.5620003f,14.305001f)
                lineTo(7.9520006f,17.718002f)
                curveTo(8.084782f,17.885462f,8.286787f,17.983091f,8.500501f,17.983091f)
                curveTo(8.714214f,17.983091f,8.91622f,17.885462f,9.049001f,17.718002f)
                lineTo(11.451f,14.286002f)
                curveTo(11.583763f,14.118168f,11.786004f,14.020283f,12.0f,14.020283f)
                curveTo(12.213996f,14.020283f,12.416237f,14.118168f,12.549f,14.286002f)
                lineTo(14.951f,17.718002f)
                curveTo(15.083763f,17.885836f,15.286004f,17.983723f,15.5f,17.983723f)
                curveTo(15.713996f,17.983723f,15.916237f,17.885836f,16.049f,17.718002f)
                lineTo(18.438f,14.305002f)
                curveTo(18.572596f,14.135688f,18.777903f,14.038105f,18.994183f,14.040647f)
                curveTo(19.210463f,14.043189f,19.41342f,14.145571f,19.543999f,14.318002f)
                lineTo(22.0f,18.002f)
            }
}

public val LucideIcons.All.ZodiacAquariusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacAquarius: ImageVector
    @Composable get() = ZodiacAquariusDefinition.asImageVector()
